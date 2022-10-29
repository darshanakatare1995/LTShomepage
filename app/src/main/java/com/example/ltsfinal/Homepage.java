package com.example.ltsfinal;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;

import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.ltsfinal.Domain.Adaptor.CategoryAdaptor;
import com.example.ltsfinal.Domain.CategoryDomain;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends AppCompatActivity {
   private RecyclerView.Adapter adapter;
   private RecyclerView recyclerViewCategoryList;
   ViewFlipper flipper;
   DrawerLayout drawerLayout;
   NavigationView navigationView;
   Toolbar toolbar;

   SearchView searchView;
   ListView listView;

   ArrayList<String> arrayList;
   ArrayAdapter<String> adapt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //To apen restaurant category

        LinearLayout rest = (LinearLayout) findViewById(R.id.rest);
        rest.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, Restcat.class);
                startActivity(intent);
            }
        }));


        //To apen Doctor category

        LinearLayout doc = (LinearLayout) findViewById(R.id.doctcat);
        doc.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, Doccat.class);
                startActivity(intent);
            }
        }));


        //To apen SchoolCollege category
        LinearLayout schcol = (LinearLayout) findViewById(R.id.schoolcol);
        schcol.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, schoolcolcat.class);
                startActivity(intent);
            }
        }));

        //To apen electronics category

        LinearLayout elect = (LinearLayout) findViewById(R.id.electitem);
        elect.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, electronicscat.class);
                startActivity(intent);
            }
        }));

        //To apen Tours category

        LinearLayout tour = (LinearLayout) findViewById(R.id.toursitem);
        tour.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, tourscat.class);
                startActivity(intent);
            }
        }));

        //To apen Repairs category

        LinearLayout repairs = (LinearLayout) findViewById(R.id.repairscat);
        repairs.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, repairscat.class);
                startActivity(intent);
            }
        }));

        //To apen Automobiles category

        LinearLayout auto = (LinearLayout) findViewById(R.id.automobiles);
        auto.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, automobilescat.class);
                startActivity(intent);
            }
        }));


        //To apen real estate category

        LinearLayout rs = (LinearLayout) findViewById(R.id.real);
        rs.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, realestatecat.class);
                startActivity(intent);
            }
        }));

        //To apen show more category

        LinearLayout sm = (LinearLayout) findViewById(R.id.show);
        sm.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, showmorecat.class);
                startActivity(intent);
            }
        }));

        // to open beautycare category

        Button bb = (Button) findViewById(R.id.beautybtn);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, beautycat.class);
                startActivity(intent);
            }
        });

        //cardview click code

        CardView cardfood = (CardView) findViewById(R.id.food);
        cardfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, foodcat.class);
                startActivity(intent);
            }
        });

        CardView cardhealth = (CardView) findViewById(R.id.health);
        cardhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, healthcat.class);
                startActivity(intent);
            }
        });
        CardView cardtoys = (CardView) findViewById(R.id.toys);
        cardtoys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, toyscat.class);
                startActivity(intent);
            }
        });
        CardView cardcloth = (CardView) findViewById(R.id.cloth);
        cardcloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, clothcat.class);
                startActivity(intent);
            }
        });
        //to open job category

        Button job = (Button) findViewById(R.id.jobbtn);
        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, jobcat.class);
                startActivity(intent);
            }
        });

        //to ope bottom navigation menu

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomnav);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.textlts);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.navhome:
                        Intent intent = new Intent(Homepage.this, Homepage.class);
                        startActivity(intent);
                        break;


                    case R.id.navcontact:
                        Intent intentcont = new Intent(Homepage.this, contactact.class);
                        startActivity(intentcont);
                        break;

                    case R.id.navshare:

                        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Text");
                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
                        startActivity(Intent.createChooser(sharingIntent, "Share using"));
                        break;

                    case R.id.back:

                        break;
                }
                return false;
            }
        });




        //search view code

        searchView = findViewById(R.id.searchview);
        listView = findViewById(R.id.listview);

        listView.setVisibility(View.GONE);

        arrayList=new ArrayList<>();
        arrayList.add("Restaurants");
        arrayList.add("Doctors");
        arrayList.add("School & Colleges");
        arrayList.add("Electronics");
        arrayList.add("Tours & Travels");
        arrayList.add("Repairs");
        arrayList.add("Automobiles");
        arrayList.add("Real Estate");
        arrayList.add("Wedding");
        arrayList.add("Personal Care");
        arrayList.add("Jobs");
        arrayList.add("Agriculture");
        arrayList.add("Astrology");
        arrayList.add("Sports");
        arrayList.add("Fitness");
        arrayList.add("Daily Needs");
        arrayList.add("Courier");
        arrayList.add("Baby Care");
        arrayList.add("Civil Contractor");
        arrayList.add("Pest Control");

        adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(adapt);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                if (s != null && !s.isEmpty()) {
                    listView.setVisibility(View.VISIBLE);

                }
                else {
                    listView.setVisibility(View.GONE);
                    adapt.getFilter().filter(s);
                }
                return false;
            }

        });
        //searchview item click code

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    //clicked to restaurant
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 1) {
                    //click to doctors
                    startActivity(new Intent(Homepage.this, Doccat.class));
                } else if (position == 2) {
                    startActivity(new Intent(Homepage.this, schoolcolcat.class));
                } else if (position == 3) {
                    startActivity(new Intent(Homepage.this, electronicscat.class));
                } else if (position == 4) {
                    startActivity(new Intent(Homepage.this, tourscat.class));
                } else if (position == 5) {
                    startActivity(new Intent(Homepage.this, repairscat.class));
                } else if (position == 6) {
                    startActivity(new Intent(Homepage.this, automobilescat.class));
                } else if (position == 7) {
                    startActivity(new Intent(Homepage.this, realestatecat.class));
                } else if (position == 8) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 9) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 10) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 11) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 12) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 13) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 14) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 15) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 16) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 17) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 18) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                } else if (position == 19) {
                    startActivity(new Intent(Homepage.this, Restcat.class));
                }
            }
        });

        //Toolbar code

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationview);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        recyclerViewCategory();

        //slider code
        int imgarray[]={R.drawable.fit,R.drawable.astro,R.drawable.agri};
        flipper=(ViewFlipper)findViewById(R.id.fliper);

        for(int i=0;i<imgarray.length;i++)
            showimage(imgarray[i]);
    }


    public void showimage(int img)
    {
        ImageView imageview = new ImageView(this);
        imageview.setBackgroundResource(img);
        flipper.addView(imageview);
        flipper.setFlipInterval(3500);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setInAnimation(this, android.R.anim.slide_out_right);
    }

    //recycler view code
    private void recyclerViewCategory(){

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList=findViewById(R.id.Recyclerview);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Agriculture","agri"));
        category.add(new CategoryDomain("Astrology","astro"));
        category.add(new CategoryDomain("Courier","cou"));
        category.add(new CategoryDomain("Fitness","fit"));
        category.add(new CategoryDomain("Pest Control","pest"));
        category.add(new CategoryDomain("Sports","sports"));
        category.add(new CategoryDomain("Wedding","wed"));

        adapter=new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);

    }
}