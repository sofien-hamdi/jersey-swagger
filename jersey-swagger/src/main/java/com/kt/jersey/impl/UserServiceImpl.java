package com.kt.jersey.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.kt.jersey.Address;
import com.kt.jersey.User;
import com.kt.jersey.UserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * 
 * @author sofien
 *
 */
@Path("/user")
@Api(value = "/user", description = "User rest web service")
@Component("userService")
public class UserServiceImpl implements UserService {
  
  /**
   * Default constructor.
   */
  public UserServiceImpl() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  @GET
  @Path("/{id}/address")
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Get user addresses - USR01", response = Address.class)
  public List<Address> getUserAddresses() {
    // TODO Auto-generated method stub
    return null;
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Get user - USR02", response = User.class)
  public User getUser(@PathParam("id") Long id) {
    // TODO Auto-generated method stub
    return new User();
  }

  @DELETE
  @Path("/{id}")
  @ApiOperation(value = "Delete user - USR03")
  public void deleteUser(@PathParam("id") Long id) {
    // TODO Auto-generated method stub
    
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Save new user - USR04", response = User.class)
  public User saveUser(User user) {
    // TODO Auto-generated method stub
    return null;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Update user - USR05")
  public void updateUser(User user) {
    // TODO Auto-generated method stub
    
  }
}
