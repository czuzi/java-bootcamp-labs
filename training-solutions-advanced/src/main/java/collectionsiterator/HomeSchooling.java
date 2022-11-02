package collectionsiterator;

import java.time.LocalDateTime;
import java.util.*;

public class HomeSchooling {

	private List<OnlineLesson> lessons = new ArrayList<>();

	public List<OnlineLesson> getLessons() {
		return lessons;
	}

	public void addNewLesson(OnlineLesson lesson) {
		lessons.add(lesson);
		lessons.sort(Comparator.comparing(OnlineLesson::getStartTime));
	}

	public List<OnlineLesson> getLessonsByTitle(String title) {
		List<OnlineLesson> result = new ArrayList<>();
		for (Iterator<OnlineLesson> i = lessons.iterator(); i.hasNext();) {
			OnlineLesson lesson = i.next();
			if (lesson.getLessonTitle().equals(title)) {
				result.add(lesson);
			}
		}
		return result;
	}

	public void removeLesson(LocalDateTime startTime) {
		Iterator<OnlineLesson> iterator = lessons.iterator();
		while (iterator.hasNext()) {
			OnlineLesson lesson = iterator.next();
			if (lesson.getStartTime().equals(startTime)) {
				iterator.remove();
			}
		}
	}
}
