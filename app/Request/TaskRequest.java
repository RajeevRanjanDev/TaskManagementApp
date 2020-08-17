package Request;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import common.StatusEnum;
import play.data.format.Formats;
import play.data.validation.Constraints;
import validators.StatusValidator;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskRequest

{


    @Id
    @Constraints.Required
    public Integer id;
    @Constraints.MaxLength(20)
    @Constraints.MinLength(5)
    @Constraints.Required
    public String name;
    @Constraints.MaxLength(200)
    public String description;
    public List<String> tags =new ArrayList<>();
    @StatusValidator
    public String status= StatusEnum.OPEN.getStautsType();
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date created_at;
    @Override
    public String toString() {
        return "TaskRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", status='" + status + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
