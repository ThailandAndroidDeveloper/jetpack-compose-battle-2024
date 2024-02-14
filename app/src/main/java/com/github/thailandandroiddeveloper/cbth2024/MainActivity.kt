package com.github.thailandandroiddeveloper.cbth2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.github.thailandandroiddeveloper.common.ui.screen.easy1.Easy1Screen
//import com.github.thailandandroiddeveloper.common.ui.screen.easy2.Easy2Screen
//import com.github.thailandandroiddeveloper.common.ui.screen.easy3.Easy3Screen
//import com.github.thailandandroiddeveloper.common.ui.screen.easy4.Easy4Screen
//import com.github.thailandandroiddeveloper.common.ui.screen.hard1.Hard1Screen
//import com.github.thailandandroiddeveloper.common.ui.screen.medium1.Medium1Screen
//import com.github.thailandandroiddeveloper.common.ui.screen.medium2.Medium2Screen
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                NavigationButton("easy1", navController)
                NavigationButton("easy2", navController)
                NavigationButton("easy3", navController)
                NavigationButton("easy4", navController)
                NavigationButton("medium1", navController)
                NavigationButton("medium2", navController)
                NavigationButton("hard1", navController)
            }
        }
//        composable("easy1") { Easy1Screen() }
//        composable("easy2") { Easy2Screen() }
//        composable("easy3") { Easy3Screen() }
//        composable("easy4") { Easy4Screen() }
//        composable("medium1") { Medium1Screen() }
//        composable("medium2") { Medium2Screen() }
//        composable("hard1") { Hard1Screen() }
    }
}

@Composable
fun NavigationButton(route: String, navController: NavController) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = { navController.navigate(route) },
    ) { Text(text = route) }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() = AppTheme {
    Main()
}