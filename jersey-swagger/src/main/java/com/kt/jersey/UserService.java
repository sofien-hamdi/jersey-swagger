package com.kt.jersey;

import java.util.List;

/**
 * User rest web service.
 * 
 * @author sofien
 *
 */
public interface UserService {
  
  /**
   * Get user addresses.
   * 
   * @return
   */
  public List<Address> getUserAddresses();

  /**
   * Get user.
   * 
   * @param id
   * @return
   */
  public User getUser(Long id);

  /**
   * Delete user.
   * 
   * @param id
   */
  public void deleteUser(Long id);

  /**
   * Save user.
   * 
   * @param user
   * @return
   */
  public User saveUser(User user);

  /**
   * Update user.
   * 
   * @param user
   */
  public void updateUser(User user);

}
