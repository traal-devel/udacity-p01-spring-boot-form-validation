package ch.traal.demo.ctrl;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.traal.demo.model.User;

@Controller
public class UserController {

  /* methods */
  @RequestMapping("add")
  public String toAdd(User user) {
    return "add";
  }

  @RequestMapping("addUser")
  public String add(@Valid User user, BindingResult result) {
    if (result.hasErrors()) {
      return "add";
    }
    System.out.println("Save user =" + user);
    return "success";
  }
}