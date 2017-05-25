package harsha.bth.App.process;

import harsha.bth.App.db.entity.ExamQuestion;

import java.util.List;


public interface ExamQuestionProcess {
    int create(List<ExamQuestion> examQuestion);
    List<Integer> find(int exam_id);
    void deleteByExamId(int exam_id);
    void deleteByQuestionId(int question_id);
}
