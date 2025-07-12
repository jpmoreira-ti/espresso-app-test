package mytestapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mytestapp.R
import com.mytestapp.SecondActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondActivityTest {

    @get:Rule
    val activityScenario = ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun validateSecondActivityInfo() {
        onView(withId(R.id.tropheuImageView))
            .check(matches(isDisplayed()))

        onView(withId(R.id.welcomeTextView))
            .check(matches(isDisplayed()))
            .check(matches(withText(R.string.welcome_message)))
    }
}