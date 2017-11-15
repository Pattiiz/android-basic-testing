package cc.somkiat.basicunittesting;


import android.os.SystemClock;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {

    }

    @Test
    public void addUserAndEmail() {
        SystemClock.sleep(500);
        onView(withId(R.id.userNameInput)).perform(typeText("Pattiiz"), closeSoftKeyboard());
        SystemClock.sleep(500);
        onView(withId(R.id.emailInput)).perform(typeText("TestEspresso@gmail.com"), closeSoftKeyboard());
        SystemClock.sleep(1000);
        onView(withId(R.id.saveButton)).perform(click());
        SystemClock.sleep(1000);
        onView(withText("Pattiiz, TestEspresso@gmail.com"))
                .inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));
    }

    @Test
    public void pressRevertButton() {
        SystemClock.sleep(500);
        onView(withId(R.id.userNameInput)).perform(typeText("Pattiiz"), closeSoftKeyboard());
        SystemClock.sleep(500);
        onView(withId(R.id.emailInput)).perform(typeText("TestEspresso@gmail.com"), closeSoftKeyboard());
        SystemClock.sleep(1000);
        onView(withId(R.id.revertButton)).perform(click());
        SystemClock.sleep(1000);
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }
}
