package com.loan.approval.service;

import com.loan.approval.exception.GeneralException;
import com.loan.approval.model.User;
import com.loan.approval.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Integer userId){
        Optional<User> user = userRepository.findById(userId);
        return user.orElseThrow(() -> new GeneralException("User Not found with id " + userId));
    }

    public String createUserList() {
        List<User> users = Arrays.asList(
                new User(1, "Alice Smith", 28, "123-456-7890", "123 Main St", 700, "Female", 110000),
                new User(2, "Bob Johnson", 35, "234-567-8901", "456 Elm St", 750, "Male", 815000),
                new User(3, "Charlie Brown", 42, "345-678-9012", "789 Oak St", 720, "Male", 220000),
                new User(4, "Diana Prince", 30, "456-789-0123", "321 Pine St", 680, "Female", 112000),
                new User(5, "Ethan Hunt", 37, "567-890-1234", "654 Cedar St", 800, "Male", 5118000),
                new User(6, "Fiona Gallagher", 25, "678-901-2345", "987 Birch St", 640, "Female", 39000),
                new User(7, "George Wilson", 50, "789-012-3456", "159 Maple St", 730, "Male", 622000),
                new User(8, "Hannah Baker", 33, "890-123-4567", "753 Spruce St", 695, "Female", 814000),
                new User(9, "Ian Wright", 29, "901-234-5678", "852 Walnut St", 460, "Male", 411000),
                new User(10, "Julia Roberts", 40, "012-345-6789", "951 Chestnut St", 745, "Female", 925000)
        );

        userRepository.saveAll(users);
        return "User list created with 10 rows.";

    }

}
