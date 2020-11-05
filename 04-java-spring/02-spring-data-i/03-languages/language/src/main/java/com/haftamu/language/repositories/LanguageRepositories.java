package com.haftamu.language.repositories;

	import java.util.List;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;
    import com.haftamu.language.models.Language;

	@Repository
	public interface LanguageRepositories extends CrudRepository<Language, Long>{
		
		List<Language> findAll();
		
		List<Language> findByNameContaining(String search);
		
		Long countByNameContaining(String search);
		
		Long deleteByNameStartingWith(String seach);
		
}
