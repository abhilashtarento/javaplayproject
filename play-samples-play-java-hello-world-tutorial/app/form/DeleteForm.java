package form;

import play.data.validation.Constraints;

import javax.validation.Constraint;

public class DeleteForm {
    @Constraints.Required
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
