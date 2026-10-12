import java.util.List;

public interface intTaskRepository {
    
    void save(Task task);
    boolean existsById(int id);
    Task findById(int id);
    List<Task> findAll();
}