import Model.UserRequestModel;

public class StepUser {
    ApiUser apiUser = new ApiUser();

    public void createUser(String name, String job, String phone) {
        UserRequestModel model = new UserRequestModel(name,job,phone);
        apiUser.createUser(model);
    }
}
