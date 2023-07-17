package de.altr.demoMVC;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository

public class UserRepository {

    private static List <User> list= new ArrayList<>(
            List.of(new User("Rich",  "Berlin")
                    ,new User("Jack", "Munchen")
                    , new User("Bob", "Rom")
                    , new User("Li", "Or")
                    ));


    public List<User> findAll(){
        return list;
    }

    public Optional<User> findByID(Long id){
        return list.stream()
                .filter(u->u.getId().equals(id))
                .findFirst();
    }
}
