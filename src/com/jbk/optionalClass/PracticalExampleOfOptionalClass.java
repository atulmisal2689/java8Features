package com.jbk.optionalClass;

public class PracticalExampleOfOptionalClass 
{
	/*  
	                        Controller Class
	                        
	@GetMapping("get-category-by-id/{id}")
	public ResponseEntity<?> getCategoryByID(@PathVariable long id) 
	{
	    Optional<CategoryModel> categoryModelOptional = service.getCategoryById(id);

	    if (categoryModelOptional.isPresent()) 
	    {
	        return ResponseEntity.ok(categoryModelOptional.get());
	    }
	    else
	    {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid Category Id");
	    }

	}
	
	*/

	
	
	/*                ServiceImpl Class
	  
	@Override
    public Optional<CategoryModel> getCategoryById(long categoryId) 
	{
        CategoryEntity categoryEntity = dao.getCategoryById(categoryId);
        return Optional.ofNullable(categoryEntity).map(entity -> modelMapper.map(entity, CategoryModel.class));
    }
    
    */

	
	
	/*
	                      DaoImpl Class
	@Override
    public CategoryEntity getCategoryById(long categoryId) 
	{
        Session session = sessionFactory.openSession();
        CategoryEntity categoryEntity = session.get(CategoryEntity.class, categoryId);
        return Optional.ofNullable(categoryEntity).orElse(null);
    }
    
    */
}
