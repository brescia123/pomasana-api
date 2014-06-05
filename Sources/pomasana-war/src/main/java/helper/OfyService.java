package helper;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

import model.PomoTask;
import model.Pomodoro;
import model.User;

public class OfyService {
    static {
        factory().register(User.class);
        factory().register(PomoTask.class);
        factory().register(Pomodoro.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
