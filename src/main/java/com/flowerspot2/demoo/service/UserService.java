//package com.flowerspot2.demoo.service;
package com.flowerspot2.demoo.service;

import com.flowerspot2.demoo.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
}
