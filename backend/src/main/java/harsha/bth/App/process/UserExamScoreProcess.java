package harsha.bth.App.process;

import harsha.bth.App.db.entity.UserExamScore;

import java.util.List;

public interface UserExamScoreProcess {
    UserExamScore findbyId(Integer id);
    Integer  updateResult(UserExamScore userExamScore);
    List<UserExamScore> findByUserId(Integer userId);
    UserExamScore create(UserExamScore userExamScore);
}
