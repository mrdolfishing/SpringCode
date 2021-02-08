package my.local.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import my.local.myproject.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	
		List<Tutorial> findByPublished(boolean published);

		List<Tutorial> findByTitleContaining(String title);

}
