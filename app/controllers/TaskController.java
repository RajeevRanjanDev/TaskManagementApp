package controllers;

import Service.TaskService;
import Request.TaskRequest;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.Logger;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import response.TaskResponse;
import utils.Util;


import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class TaskController extends Controller {

    private HttpExecutionContext ec;
    private TaskService taskService;
    @Inject
    private ObjectMapper mapper;

    @Inject
    public TaskController(HttpExecutionContext ec, TaskService taskService) {
        this.taskService = taskService;
        this.ec = ec;
    }

    public CompletionStage<Result> create() {
        return supplyAsync(() -> {
            List<TaskResponse> taskResponses = null;
            try {

                List<TaskRequest> taskRequestList = mapper.readValue(request().body().asJson().toString(), new TypeReference<List<TaskRequest>>(){});

            taskResponses=   taskRequestList.stream().map(taskRequest -> taskService.addTask(taskRequest)).collect(Collectors.toList());
            } catch (Exception e) {
                return badRequest(e.getMessage());
            }
            if(taskResponses.isEmpty())
            { return internalServerError(Util.createResponse("Could not create task.", false));
            }
            else {
              return   ok(Json.toJson(taskResponses));
            }

        }, ec.current());
    }

    public CompletionStage<Result> findAll() {
        return supplyAsync(() -> {
            List<TaskResponse> taskResponses = null;
            try {

                taskResponses=  taskService.findAllTask(request().queryString().entrySet());
            } catch (Exception e) {
                return badRequest(e.getMessage());
            }
            if(taskResponses.isEmpty())
            { return internalServerError(Util.createResponse("Could not find tasks.", false));
            }
            else {
                return   ok(Json.toJson(taskResponses));
            }

        }, ec.current());
    }



}
