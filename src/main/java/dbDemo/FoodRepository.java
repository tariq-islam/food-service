/**
@author Raymond Vargas
@Version 1.0
**/

package dbDemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
The FoodRepository extends the CrudRepository interface for use by food objects in the food database.
Allows for CRUD operations on food items within the database. 
**/
@RepositoryRestResource
public interface FoodRepository extends CrudRepository<Food, Integer> {}