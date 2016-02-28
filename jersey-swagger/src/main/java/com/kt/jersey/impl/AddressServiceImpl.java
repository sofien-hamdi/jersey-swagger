package com.kt.jersey.impl;

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
import com.kt.jersey.AddressService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * 
 * @author sofien
 *
 */
@Path("/address")
@Api(value = "/address", description = "Address rest web service")
@Component("addressService")
public class AddressServiceImpl implements AddressService {
  
  /**
   * Default constructor.
   */
  public AddressServiceImpl() {
    super();
  }
  
  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Get address - ADR01", response = Address.class)
  public Address getAddress(@PathParam("id") Long id) {
    // TODO Auto-generated method stub
    return null;
  }
  
  @DELETE
  @Path("/{id}")
  @ApiOperation(value = "Delete user - ADR02")
  public void deleteAddress(@PathParam("id") Long id) {
    // TODO Auto-generated method stub
  }
  
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Save new address - ADR03", response = Address.class)
  public Address saveAddress(Address address) {
    // TODO Auto-generated method stub
    return null;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  @ApiOperation(value = "Update address - ADR04")
  public void updateAddress(Address address) {
    // TODO Auto-generated method stub
  }

}
