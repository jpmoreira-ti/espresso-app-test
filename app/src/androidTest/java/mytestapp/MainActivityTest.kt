package mytestapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import com.mytestapp.MainActivity
import com.mytestapp.SecondActivity
import org.junit.After
import org.junit.Before
import com.mytestapp.R as Main
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityScenario = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        Intents.init()
    }

    @After
    fun tearDown() {
        Intents.release()
    }

    @Test
    fun validateMainActivityInfo() {
        onView(withId(Main.id.mainLabel))
            .check(matches(isDisplayed()))
            .check(matches(withText(Main.string.main_label)))

        onView(withId(Main.id.subLabel))
            .check(matches(isDisplayed()))
            .check(matches(withText(Main.string.sub_label)))

        onView(withId(Main.id.startButton))
            .check(matches(isDisplayed()))
            .check(matches(withText(Main.string.start_button)))
    }

    @Test
    fun validateClickOnButtonOpenSecondActivity() {
        onView(withId(Main.id.startButton))
            .perform(click())

        Intents.intended(hasComponent(SecondActivity::class.java.name))
    }
}