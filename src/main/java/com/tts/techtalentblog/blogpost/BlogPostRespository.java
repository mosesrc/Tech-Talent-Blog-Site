package com.tts.techtalentblog.blogpost;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// The Respository represents the database table itself
/* 
 * We are defining an interface not a class 
 * Because JPA is interested in why we want to access that table, and in what ways....
 * It is in charge of figuring out HOW.....
 *  */

/* 
 * In order for something to be a resposity, we have to inherit from 
 * The Repository interface.......(directly or indirectly)
 * CrudRepository is an interface that inherits from Repository
 * */

@Repository
public interface BlogPostRespository extends CrudRepository<BlogPost, Long> {
	
	
	
}
