package com.example.movieapp.data

data class Movie(
    val id: String,
    val title: String,
    val year: Int,
    val rated: String,
    val released: String,
    val actors: String,
    val language: String,
    val country: String,
    val plot: String,
    val poster: String,
    val images : List<String>
)

fun GetMovies() : List<Movie>{
    return listOf<Movie>(
        Movie(id ="tt0499549",
            title = "Avatar",
            year =2009,
            rated= "PG-13",
            released= "18 Dec 2009",
            actors= "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            language= "English, Spanish",
            country= "USA, UK",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg",
            images = listOf("https://images-na.ssl-images-amazon.com/images/M/MV5BMjEyOTYyMzUxNl5BMl5BanBnXkFtZTcwNTg0MTUzNA@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNzM2MDk3MTcyMV5BMl5BanBnXkFtZTcwNjg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTY2ODQ3NjMyMl5BMl5BanBnXkFtZTcwODg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTYxMDg1Nzk1MV5BMl5BanBnXkFtZTcwMDk0MTUzNA@@._V1_SX1500_CR0,0,1500,999_AL_.jpg"
            )
        ),
        Movie( id =  "tt0848228",
            title = "The Avengers",
            year= 2012,
            rated= "PG-13",
            released= "04 May 2012",
            actors= "Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth",
            language= "English, Russian",
            country="USA",
            plot = "Earth's mightiest heroes must come together and learn to fight as a team if they are to stop the mischievous Loki and his alien army from enslaving humanity.",
            poster= "http://ia.media-imdb.com/images/M/MV5BMTk2NTI1MTU4N15BMl5BanBnXkFtZTcwODg0OTY0Nw@@._V1_SX300.jpg",
            images = listOf("https://images-na.ssl-images-amazon.com/images/M/MV5BMTA0NjY0NzE4OTReQTJeQWpwZ15BbWU3MDczODg2Nzc@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMjE1MzEzMjcyM15BMl5BanBnXkFtZTcwNDM4ODY3Nw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMjMwMzM2MTg1M15BMl5BanBnXkFtZTcwNjM4ODY3Nw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ4NzM2Mjc5MV5BMl5BanBnXkFtZTcwMTkwOTY3Nw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTc3MzQ3NjA5N15BMl5BanBnXkFtZTcwMzY5OTY3Nw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            )

        ),
        Movie(id = "tt0993846",
            title= "The Wolf of Wall Street",
            year =2013,
            rated= "R",
            released= "25 Dec 2013",
            actors= "Leonardo DiCaprio, Jonah Hill, Margot Robbie, Matthew McConaughey",
            language= "English, French",
            country= "USA",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",
            poster= "http://ia.media-imdb.com/images/M/MV5BMjIxMjgxNTk0MF5BMl5BanBnXkFtZTgwNjIyOTg2MDE@._V1_SX300.jpg",
            images = listOf(
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNDIwMDIxNzk3Ml5BMl5BanBnXkFtZTgwMTg0MzQ4MDE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTc0NzAxODAyMl5BMl5BanBnXkFtZTgwMDg0MzQ4MDE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTExMDk1MDE4NzVeQTJeQWpwZ15BbWU4MDM4NDM0ODAx._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTg3MTY4NDk4Nl5BMl5BanBnXkFtZTgwNjc0MzQ4MDE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTgzMTg4MDI0Ml5BMl5BanBnXkFtZTgwOTY0MzQ4MDE@._V1_SY1000_CR0,0,1553,1000_AL_.jpg"
            )
        ),
        Movie(id = "tt0816692",
            title= "Interstellar",
            year= 2014,
            rated= "PG-13",
            released= "07 Nov 2014",
            actors= "Ellen Burstyn, Matthew McConaughey, Mackenzie Foy, John Lithgow",
            language = "English",
            country=  "USA, UK",
            plot = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            poster =  "http://ia.media-imdb.com/images/M/MV5BMjIxNTU4MzY4MF5BMl5BanBnXkFtZTgwMzM4ODI3MjE@._V1_SX300.jpg",
            images = listOf(
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMjA3NTEwOTMxMV5BMl5BanBnXkFtZTgwMjMyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMzQ5ODE2MzEwM15BMl5BanBnXkFtZTgwMTMyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTg4Njk4MzY0Nl5BMl5BanBnXkFtZTgwMzIyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMzE3MTM0MTc3Ml5BMl5BanBnXkFtZTgwMDIyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNjYzNjE2NDk3N15BMl5BanBnXkFtZTgwNzEyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg"
            )
        ),
        Movie( id =  "tt0944947",
            title= "Game of Thrones",
            year= 2011,
            rated= "TV-MA",
            released= "17 Apr 2011",
            actors =  "Peter Dinklage, Lena Headey, Emilia Clarke, Kit Harington",
            language =  "English",
            country= "USA, UK",
            plot = "While a civil war brews between several noble families in Westeros, the children of the former rulers of the land attempt to rise up to power. Meanwhile a forgotten race, bent on destruction, plans to return after thousands of years in the North.",
            poster =  "http://ia.media-imdb.com/images/M/MV5BMjM5OTQ1MTY5Nl5BMl5BanBnXkFtZTgwMjM3NzMxODE@._V1_SX300.jpg",
            images = listOf("https://images-na.ssl-images-amazon.com/images/M/MV5BNDc1MGUyNzItNWRkOC00MjM1LWJjNjMtZTZlYWIxMGRmYzVlXkEyXkFqcGdeQXVyMzU3MDEyNjk@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BZjZkN2M5ODgtMjQ2OC00ZjAxLWE1MjMtZDE0OTNmNGM0NWEwXkEyXkFqcGdeQXVyNjUxNzgwNTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMDk4Y2Y1MDAtNGVmMC00ZTlhLTlmMmQtYjcyN2VkNzUzZjg2XkEyXkFqcGdeQXVyNjUxNzgwNTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNjZjNWIzMzQtZWZjYy00ZTkwLWJiMTYtOWRkZDBhNWJhY2JmXkEyXkFqcGdeQXVyMjk3NTUyOTc@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNTMyMTRjZWEtM2UxMS00ZjU5LWIxMTYtZDA5YmJhZmRjYTc4XkEyXkFqcGdeQXVyMjk3NTUyOTc@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            )
        )
    )
}