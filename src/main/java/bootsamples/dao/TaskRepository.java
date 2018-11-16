package bootsamples.dao;

import org.springframework.data.repository.CrudRepository;

import bootsamples.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
