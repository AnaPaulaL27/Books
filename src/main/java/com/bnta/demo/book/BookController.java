package com.bnta.demo.book;

//BookController class to handle/route pet related HTTP requests

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//registers it as a controller with Spring for automatic DI/IOC handling
//Also enables automatic JSON serialization of method return values on this class. So our service provides valid JSON resources
//as default behaviour
@RestController
@RequestMapping("Books") //specifies endpoint that we are handing HTTP requests for, which we specified as 'books'

public class BookController {

    //create a method to handle GET request + return some values as a resource
    //Since we have not provided a path value to @GetMapping, it will use the default books path we specified for this
    // controller with @RequestMapping
    @GetMapping
    public List<String> getBooks() {
        //return type= a list of string values
        //use Array.asList utility method to generate list of strings and return them
        return Arrays.asList("The mind of the Leader", "Platform Revolution", "How To Be Better At (Almost Everything");
    }
}
