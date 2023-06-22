package com.example.instagramexpelorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.instagramexpelorer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val internetErrorUrl = "https://cdn.dribbble.com/users/1375592/screenshots/5928783/no_internet.gif"
        val url = listOf(
            "https://images.adsttc.com/media/images/563c/b089/e58e/ce8c/e300/0095/original/Metropolis_Madrid.gif?1446817925" ,
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-01-1600x1000-1-1536x960.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-02-2048x1346-1-1536x1010.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-03-2880x1800-1-1536x960.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-04-1680x1050-1-1536x960.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-05-1920x1080-1-1536x864.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-06-1920x1200-1-1536x960.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-07-2560x1600-1-1536x960.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-08-1920x1200-1-1536x960.jpg",
            "https://nemadeshahr.com/wp-content/uploads/2021/09/urban_element-good.gif",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-10-2048x1365-1-1536x1024.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-11-1600x1064-1-1536x1021.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-12-1280x763-1.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-15-1680x1050-1-1536x960.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-16-1280x728-1.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-17-1920x1080-1-1536x864.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-18-1920x1200-1-1536x960.jpg",
            "https://trumpwallpapers.com/wp-content/uploads/Germany-Wallpaper-24-3840x2160-1-1536x864.jpg"

        )
        val images = mutableListOf(
            binding.img1 ,
            binding.img2 ,
            binding.img3 ,
            binding.img4 ,
            binding.img5 ,
            binding.img6 ,
            binding.img7 ,
            binding.img8 ,
            binding.img9 ,
            binding.img10 ,
            binding.img11 ,
            binding.img12 ,
            binding.img13 ,
            binding.img14 ,
            binding.img15 ,
            binding.img16 ,
            binding.img17 ,
            binding.img18 ,

            )
        if ( NetworkChecker(this).isInternetConnected ) {

            // use glide :
            val glide = Glide.with(this)

            for (i in 0..17) {
                glide
                    .load(url[i])
                    .error(R.drawable.network_error)
                    .override(400,400)
                    .into(images[i])
            }

        }
        else {
            Toast.makeText(this, "Please check your internet connection ...", Toast.LENGTH_SHORT).show()
        }
    }
}