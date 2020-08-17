package Service;

import Request.TaskRequest;
import Translator.TaskTranslator;
import com.avaje.ebean.*;
import models.Task;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import response.TaskResponse;

import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;


public class TaskService {
    @Inject
    TaskTranslator taskTranslator;
    @Inject
    FormFactory formFactory;
    public TaskResponse addTask(TaskRequest taskRequest) {
        Form<TaskRequest> post = formFactory.form(TaskRequest.class).bind(Json.toJson(taskRequest));
            if (post.hasErrors()) {

                return taskTranslator.translateTaskRequestToErrorTask(taskRequest,post.errorsAsJson().toString());
            }
            else{
                Task task= taskTranslator.translateTaskRequestToTask(taskRequest);
                Task taskDb= Task.find.byId(task.id);
                if(Objects.nonNull(taskDb))
                {
                    return taskTranslator.translateTaskRequestToErrorTask(taskRequest,"Task with same id already persent");

                }
                task.save();

            }
      return  taskTranslator.translateTaskRequestToSuccessTask(taskRequest);

    }
    public   List<TaskResponse> findAllTask(Set<Map.Entry<String,String[]>> query) {
         StringBuilder page = new StringBuilder();
        StringBuilder pageSize = new StringBuilder();
        StringBuilder sortBy =new StringBuilder();
        StringBuilder sortMode =new StringBuilder();

        ExpressionList<Task> expressionList=  Ebean.find(Task.class).where();

        for (Map.Entry<String, String[]> entry : query) {
            String value= Arrays.toString(entry.getValue());
             processQueryMap(entry.getKey(),value.substring(1,value.length()-1),page,pageSize,sortBy,sortMode,  expressionList);
        }
        setSorting(sortMode.toString(),sortBy.toString(),expressionList);
        List<Task> taskList=getTaskList(page,pageSize,expressionList);
        return taskList.stream().map(task -> taskTranslator.translateTaskToSuccessTask(task)).collect(Collectors.toList());

    }
        private void createFilter(String key,String value,ExpressionList<Task> expressionList)
        {
            expressionList.add(Expr.like(key,value));

        }
        private void processQueryMap(String key,String value,StringBuilder page,StringBuilder pageSize,StringBuilder sortBy,StringBuilder sortMode,ExpressionList<Task> expressionList)
        {
            switch (key) {
                case "page":
                    page.append(value);
                    break;
                case "page_size":
                    pageSize.append(value);
                    break;
                case "sort_by":
                    sortBy.append(value);
                    break;
                case "sort_mode":
                    sortMode.append(value);
                    break;
                default:
                    createFilter(key, value, expressionList);
            }
        }

        private void setSorting(String sortMode,String sortBy,ExpressionList<Task> expressionList) {
            if (!sortBy.isEmpty() && !sortMode.isEmpty()) {
                if (sortMode.equals("ASC")) {
                    expressionList.orderBy().asc(sortBy);
                } else if (sortMode.equals("DESC")) {
                    expressionList.orderBy().desc(sortBy);
                }


            }
        }
        private List<Task> getTaskList(StringBuilder page,StringBuilder pageSize,ExpressionList<Task> expressionList) {
            if (page.length() != 0 && pageSize.length() != 0) {
                return expressionList.findPagedList(Integer.parseInt(page.toString()) - 1, Integer.parseInt(pageSize.toString())).getList();

            } else {
                return expressionList.findList();

            }
        }
}
