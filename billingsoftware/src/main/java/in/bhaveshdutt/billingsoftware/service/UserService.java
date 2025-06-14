package in.bhaveshdutt.billingsoftware.service;

import java.util.List;

import in.bhaveshdutt.billingsoftware.io.UserRequest;
import in.bhaveshdutt.billingsoftware.io.UserResponse;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
