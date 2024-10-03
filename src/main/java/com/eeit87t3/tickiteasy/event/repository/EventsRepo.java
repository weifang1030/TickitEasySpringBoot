package com.eeit87t3.tickiteasy.event.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eeit87t3.tickiteasy.categoryandtag.entity.CategoryEntity;
import com.eeit87t3.tickiteasy.categoryandtag.entity.TagEntity;
import com.eeit87t3.tickiteasy.event.entity.EventsEntity;

/**
 * @author Chuan(chuan13)
 */
public interface EventsRepo extends JpaRepository<EventsEntity, Integer> {

	List<EventsEntity> findByEventCategory(CategoryEntity eventCategory);
	List<EventsEntity> findByEventTag(TagEntity eventTag);
}
