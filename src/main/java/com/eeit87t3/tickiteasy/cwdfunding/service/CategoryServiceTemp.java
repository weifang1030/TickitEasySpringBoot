package com.eeit87t3.tickiteasy.cwdfunding.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eeit87t3.tickiteasy.categoryandtag.entity.CategoryEntity;
import com.eeit87t3.tickiteasy.categoryandtag.repository.CategoryRepo;
import com.eeit87t3.tickiteasy.cwdfunding.entity.Category;
import com.eeit87t3.tickiteasy.cwdfunding.repository.CategoryRepository;

/**
 * @author Chuan(chuan13)
 */
@Service
public class CategoryServiceTemp {
	
	@Autowired
	private CategoryRepository categoryRepository;

//	/**
//	 * 取得 Event 功能的活動型態列表。
//	 * 
//	 * @return eventCategoryList - List&lt;CategoryEntity>：Event 功能的活動型態列表。
//	 */
//	public List<CategoryEntity> findEventCategoryList() {
//		return categoryRepo.findByCategoryStatus((short) 0);
//	}
//	
//	/**
//	 * 取得 Product 功能的活動型態列表。
//	 * 
//	 * @return productCategoryList - List&lt;CategoryEntity>：Product 功能的活動型態列表。
//	 */
//	public List<CategoryEntity> findProductCategoryList() {
//		return categoryRepo.findByCategoryStatus((short) 0);
//	}
//	
	/**
	 * 取得 CwdFunding 功能的活動型態列表。
	 * 
	 * @return fundProjCategoryList - List&lt;CategoryEntity>：CwdFunding 功能的活動型態列表。
	 */
	public List<Category> findFundProjCategoryList() {
		return categoryRepository.findByCategoryStatus((short) 0);
	}
//	
//	/**
//	 * 取得 Post 功能的活動型態列表。
//	 * 
//	 * @return postCategoryList - List&lt;CategoryEntity>：Post 功能的活動型態列表。
//	 */
//	public List<CategoryEntity> findPostCategoryList() {
//		List<CategoryEntity> postCategoryList = new ArrayList<>();
//		postCategoryList.addAll(categoryRepo.findByCategoryStatus((short) 0));
//		postCategoryList.addAll(categoryRepo.findByCategoryStatus((short) 1));
//		return postCategoryList;
//	}
}
