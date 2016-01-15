/**
The rest controller specifies the RESTful endpoint for the food service
The controller also maps methods to the RESTful action specified and reads in any necessary parameters

@author Raymond Vargas
@version 1.0
**/
package dbDemo;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
//specifying endpoint location
@RequestMapping("/food")
public class FoodRestController {
	
	@Autowired
	  private FoodRepository repo;
	
	/** 
	the getAll method retrieves all food items in the database. This is mapped to hte GET rest action
	@return A List() of food items
	**/
	@RequestMapping(method=RequestMethod.GET)
	  public List<Food> getAll() {
	    return (List<Food>) repo.findAll();
	  }
	  /** 
	  the create method is mapped to the POST rest action. This will invoke the food repository and create a new 
	  food item in the database
	  @param food The food item to be added to the database
	  @return newly created food item into the database
	  **/
	  @RequestMapping(method=RequestMethod.POST)
	  public Food create(@RequestBody Food food) {
	    return repo.save(food);
	  }
	  /**
	  The delete method will remove the food item with the corresponding ID from the database
	  @param id the ID of the item to remove
	  @return none
	  **/
	  @RequestMapping(method=RequestMethod.DELETE, value="{id}")
	  public void delete(@PathVariable Integer id) {
		  repo.delete(id);

	  }
	  
	  /**
	  the update method will update the values of an existing food item
	  @param id the id of the food item whose properties are to be updated
	  @param food the food item with the updated values
	  @return Food the newly updated food item, saved in the database
	  **/
	  @RequestMapping(method=RequestMethod.PUT, value="{id}")
	  public Food update(@PathVariable Integer id, @RequestBody Food food) {
		  Food update = repo.findOne(id);
		    update.setName(food.getName());
		    update.setAuthor(food.getAuthor());
		    update.setRating(food.getRating());
		    update.setCategory(food.getCategory());
		    
		    return repo.save(update);
	  }

	}


