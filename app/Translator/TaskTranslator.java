package Translator;

import Request.TaskRequest;
import common.StatusEnum;
import models.Task;
import org.modelmapper.ModelMapper;
import response.TaskErrorResponse;
import response.TaskSuccessResponse;

import javax.inject.Inject;

public class TaskTranslator extends BaseObjectTranslator {
    @Inject
    public TaskTranslator(ModelMapper mapper) {
        super(mapper);
    }
    public Task translateTaskRequestToTask(TaskRequest request)
    {
     return    map(request,Task.class);
    }
    public TaskErrorResponse translateTaskRequestToErrorTask(TaskRequest request,String error)
    {
          TaskErrorResponse taskErrorResponse=  map(request, TaskErrorResponse.class);
        taskErrorResponse.setStatus(StatusEnum.ERROR.getStautsType());
          taskErrorResponse.setError(error);
          return taskErrorResponse;
    }
    public TaskSuccessResponse translateTaskRequestToSuccessTask(TaskRequest request)
    {
       return  map(request, TaskSuccessResponse.class);

    }
    public TaskSuccessResponse translateTaskToSuccessTask(Task request)
    {
        return  map(request, TaskSuccessResponse.class);

    }
}
