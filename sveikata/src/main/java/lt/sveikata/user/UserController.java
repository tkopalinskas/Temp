package lt.sveikata.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

//	@RequestMapping(value = "/allUsers", method = RequestMethod.GET)
//	public List<UserForClient> giveAllUser() {
//		return getUserService().receiveAllUsers();
//	}

//	@RequestMapping(value = "/admin/addNewAdmin", method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public void createUser(@RequestBody final AddNewUser newUser) {
//		userService.addNewUser(newUser);
//	}

//	@RequestMapping(/*value = "/admin/findUser/manageUser", */path = "/{id}", method = RequestMethod.DELETE)
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void deleteAdminFromDatabase(@PathVariable final Long id) {
//		userService.deleteUser(id);
//	}

//	@RequestMapping(value = "/admin/findUser/manageUser/{id=7}", method = RequestMethod.PATCH)
//	@ResponseStatus(HttpStatus.CREATED)
//	public void updateExistingAdmin(@RequestBody final User user, @PathVariable final Long id) {
//		userService.updateUser(user, id);
//	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}