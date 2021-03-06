package com.hroscope.cegep.cegephoroscope.zodiacDetail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hroscope.cegep.cegephoroscope.PagerContainer;
import com.hroscope.cegep.cegephoroscope.R;
import com.hroscope.cegep.cegephoroscope.zodiacCompatibility.Comapatibity;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ZodiaDetail extends Activity implements View.OnClickListener {
   //firebase


    //widets for dayone
    public ImageView todayPersonProfile,todayShare,todayZodImage;
<<<<<<< HEAD
    public TextView dayoneDate,daytwoDate,daythreeDate,dayfourDate,dayfiveDate,datesixDate,daysevenDate,titlezod,weekdate;
    public TextView dayoneInfo,daytwoInfo,daythreeInfo,dayfourInfo,dayfiveInfo,daysixInfo,daysevenInfo,weekinfo;
    public TextView dayOneTitle,dayTwoTitle,dayThreeTitle,dayFourTitle,dayFiveTitle,daySixTitle,daySevenTitle,weektitle;
    String zod_current="",zodYesterday="",zodTomorrow="",zodMonthly="",zodYearly="",zodWeekly="";
=======
    public TextView dayoneDate,daytwoDate,daythreeDate,dayfourDate,dayfiveDate, daysixthDate,daysevenDate,titlezod,weekdate;
    public TextView dayoneInfo,daytwoInfo,daythreeInfo,dayfourInfo,dayfiveInfo,daysixInfo,daysevenInfo,weekinfo;
    public TextView dayOneTitle,dayTwoTitle,dayThreeTitle,dayFourTitle,dayFiveTitle,daySixTitle,daySevenTitle,weektitle;
    String zod_current="",zodYesterday="",zodTomorrow="",zodMonthly="",zodYearly="",zodWeekly="";
    public static Intent intent;
>>>>>>> Sachin_Fragment

    View  dayone,daytwo,daythree,dayfour,dayfive,daysix,dayseven,week;
    PagerContainer mContainer;
    ViewPager pager;
    PagerAdapter adapter;
    int[] mResources = {
            R.layout.dayone,
            R.layout.daytwo,
            R.layout.daythree,
            R.layout.dayfour,
            R.layout.dayfive,
            R.layout.daysix};
     String zodiac_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodia_detail);


        titlezod = (TextView) findViewById(R.id.titlezod);
        todayPersonProfile = (ImageView) findViewById(R.id.todaypersonimg);
        todayShare = (ImageView) findViewById(R.id.todayimgeshare);
        todayZodImage = (ImageView) findViewById(R.id.todayzodimage);
        zodiac_title = getIntent().getStringExtra("text");
        zod_current = getIntent().getStringExtra("current");
        zodTomorrow = getIntent().getStringExtra("tomorrow");
        zodYesterday = getIntent().getStringExtra("yesterday");
        zodWeekly = getIntent().getStringExtra("weekly");
        zodMonthly = getIntent().getStringExtra("monthly");
        zodYearly = getIntent().getStringExtra("yearly");
<<<<<<< HEAD
=======
        todayZodImage.setOnClickListener(this);
>>>>>>> Sachin_Fragment

        initializeviews();
        titlezod.setGravity(Gravity.CENTER);
        titlezod.setTextSize(30);
        titlezod.setTextColor(Color.rgb(255, 255, 255));
        //make title Bold
        final SpannableStringBuilder sb = new SpannableStringBuilder(zodiac_title);
        final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);

        //curent day
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);
        titlezod.setText(zodiac_title);
        if (zodiac_title.equals("Aries"))
            todayZodImage.setImageResource(R.mipmap.aries);
        else if (zodiac_title.equals("Taurus"))
            todayZodImage.setImageResource(R.mipmap.taurus);
        else if (zodiac_title.equals("Gemini"))
            todayZodImage.setImageResource(R.mipmap.gemini);
        else if (zodiac_title.equals("Cancer"))
            todayZodImage.setImageResource(R.mipmap.cancer);
        else if (zodiac_title.equals("Leo"))
            todayZodImage.setImageResource(R.mipmap.leo);
        else if (zodiac_title.equals("Virgo"))
            todayZodImage.setImageResource(R.mipmap.virgo);
        else if (zodiac_title.equals("Libra"))
            todayZodImage.setImageResource(R.mipmap.libra);
        else if (zodiac_title.equals("Scorpio"))
            todayZodImage.setImageResource(R.mipmap.scorpio);
        else if (zodiac_title.equals("Sagittarus"))
            todayZodImage.setImageResource(R.mipmap.sagittarius);
        else if (zodiac_title.equals("Capricorn"))
            todayZodImage.setImageResource(R.mipmap.capricorn);
        else if (zodiac_title.equals("Aquarius"))
            todayZodImage.setImageResource(R.mipmap.aquarius);
        else if (zodiac_title.equals("Pisces"))
            todayZodImage.setImageResource(R.mipmap.pisces);

    }
        private void initializeviews() {

        mContainer = (PagerContainer) findViewById(R.id.pager_container);
        pager = mContainer.getViewPager();
        adapter = new MyPagerAdapter(this,zod_current,zodYesterday,zodTomorrow,zodWeekly,zodMonthly,zodYearly);
        pager.setAdapter(adapter);
        //Necessary or the pager will only have one extra page to show
        // make this at least however many pages you can see
        pager.setOffscreenPageLimit(adapter.getCount());
        //A little space between pages
        pager.setPageMargin(50);
        //If hardware acceleration is enabled, you should also remove
        // clipping on the pager for its children.
        pager.setClipChildren(false);
    }
<<<<<<< HEAD
=======

    @Override
    public void onClick(View view) {

     if(view==todayZodImage)
     {
         Intent intent = new Intent(ZodiaDetail.this, Comapatibity.class);
         intent.putExtra("zodiac_click",zodiac_title);
         startActivity(intent);


     }
    }
>>>>>>> Sachin_Fragment
//    public void initializeFirebase()
//    {
//
//        firebaseAuth= FirebaseAuth.getInstance();
//        storage = FirebaseStorage.getInstance();
//        storageRef = storage.getReferenceFromUrl("gs://cegephoroscope-3dcdb.appspot.com/");
//        database = FirebaseDatabase.getInstance();
//        databaseReference = database.getReference("Horoscope");
//
//    }
//    public void setDataToWidgets()
//    {
//        //set data for Today
//        //Zodiac Title Text
//
//
//        ValueEventListener postListener = new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//                ZodiacTodayList user = dataSnapshot.getValue(ZodiacTodayList.class);
//
//
//                Toast.makeText(ZodiaDetail.this, user.summary,Toast.LENGTH_SHORT).show();
//                dayoneInfo.setText(user.summary.toString());
//            }
//
//
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
//            }
//        };
//        databaseReference.child("Zodiac").child(zodiac_title).child("Daily").child("today");
//
//    }
//Nothing special about this adapter, just throwing up colored views for demo

    private  class MyPagerAdapter extends  PagerAdapter {

        Context mContext;
        LayoutInflater mLayoutInflater;
        String zod_current="",zodYesterday="",zodTomorrow="",zodMonthly="",zodYearly="",zodWeekly="";
        public MyPagerAdapter(Context context,String zod_current,String zodYesterday,String zodTomorrow,String zodWeekly,String zodMonthly,String zodYearly) {
            mContext = context;
            this.zod_current = zod_current;
            this.zodYesterday=zodYesterday;
            this.zodTomorrow=zodTomorrow;
            this.zodWeekly=zodWeekly;
            this.zodMonthly=zodMonthly;
            this.zodYearly=zodYearly;
            mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return mResources.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((LinearLayout) object);
        }

        public void setContolls()
        {

            //day one
            dayOneTitle = (TextView)dayone.findViewById(R.id.dayOneTitle);
            dayoneInfo = (TextView)dayone.findViewById(R.id.datoneInfo);
            dayoneDate = (TextView)dayone.findViewById(R.id.dayOneDate);
            //day Two
            dayTwoTitle = (TextView)daytwo.findViewById(R.id.daytwoTitle);
            daytwoInfo = (TextView)daytwo.findViewById(R.id.tdaytwoInfo);
            daytwoDate = (TextView)daytwo.findViewById(R.id.daytwoDate);
            //day Three
            dayThreeTitle = (TextView)daythree.findViewById(R.id.daythreetitle);
            daythreeInfo = (TextView)daythree.findViewById(R.id.daythreeinfo);
            daythreeDate = (TextView)daythree.findViewById(R.id.daythreedate);
            //day four
            dayFourTitle = (TextView)dayfour.findViewById(R.id.dayfourTitle);
            dayfourInfo = (TextView)dayfour.findViewById(R.id.dayfourinfo);
            dayfourDate = (TextView)dayfour.findViewById(R.id.dayfourDate);
            //day five
            dayFiveTitle = (TextView)dayfive.findViewById(R.id.dayfiveTitle);
            dayfiveInfo = (TextView)dayfive.findViewById(R.id.dayfiveinfo);
            dayfiveDate = (TextView)dayfive.findViewById(R.id.dayfiveDate);
            //day six
            daySixTitle = (TextView)daysix.findViewById(R.id.daysixTitle);
            daysixInfo = (TextView)daysix.findViewById(R.id.daysixinfo);
<<<<<<< HEAD
            datesixDate = (TextView)daysix.findViewById(R.id.daysixDate);
=======
            daysixthDate = (TextView)daysix.findViewById(R.id.daysixDate);
>>>>>>> Sachin_Fragment
//            //day seven
//            daySevenTitle = (TextView)dayseven.findViewById(R.id.daysevenTitle);
//            daysevenInfo = (TextView)dayseven.findViewById(R.id.dayseveninfo);
//            daysevenDate = (TextView)dayseven.findViewById(R.id.daysevenDate);
//            //week
//            weektitle= (TextView)dayseven.findViewById(R.id.weekTitle);
//            weekinfo = (TextView)dayseven.findViewById(R.id.weekInfo);
//            weekdate = (TextView)dayseven.findViewById(R.id.weekdate);

        }
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            dayone = mLayoutInflater.inflate(R.layout.dayone, container, false);
            daytwo = mLayoutInflater.inflate(R.layout.daytwo, container, false);
            daythree = mLayoutInflater.inflate(R.layout.daythree, container, false);
            dayfour = mLayoutInflater.inflate(R.layout.dayfour, container, false);
            dayfive = mLayoutInflater.inflate(R.layout.dayfive, container, false);
            daysix = mLayoutInflater.inflate(R.layout.daysix, container, false);
           // dayseven = mLayoutInflater.inflate(R.layout.dayseven, container, false);
            //week = mLayoutInflater.inflate(R.layout.week, container, false);
            View viewrrr [] ={dayone,daytwo,daythree,dayfour,dayfive,daysix};

            setContolls();
<<<<<<< HEAD
            dayoneInfo.setText(zod_current);
            daytwoInfo.setText(zodYesterday);
            daythreeInfo.setText(zodTomorrow);
            dayfourInfo.setText(zodWeekly);
            dayfiveInfo.setText(zodMonthly);
=======
            //today
            dayoneDate.setText(getToday());
            dayoneInfo.setText(zod_current);
           //yesterday
            daytwoDate.setText(getYesterdayDateString());
            daytwoInfo.setText(zodYesterday);

            daythreeDate.setText(getTomorrowDateString());
            daythreeInfo.setText(zodTomorrow);


            dayfourDate.setText(getWeeklyDateString());
            dayfourInfo.setText(zodWeekly);

            dayfiveDate.setText(getcuttentMonthString());
            dayfiveInfo.setText(zodMonthly);

            daysixthDate.setText(getcuttentYearString());
>>>>>>> Sachin_Fragment
            daysixInfo.setText(zodYearly);

            container.addView(viewrrr[position]);

            return viewrrr[position];
        }



        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((LinearLayout) object);
        }

<<<<<<< HEAD
=======
    }

    public String getToday()
    {
        Format formatter = new SimpleDateFormat("EEEE, MMMM dd  yyyy");
        String today = formatter.format(new Date());
        return today;
    }

    private Date yesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.getTime();

    }

    private String getYesterdayDateString() {
        DateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd  yyyy");
        return dateFormat.format(yesterday());
    }


    private Date tomorrowday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        return cal.getTime();

    }

    private String getTomorrowDateString() {
        DateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd  yyyy");
        return dateFormat.format(tomorrowday());
    }

    private Date weeklyStartDate() {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int i = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
        c.add(Calendar.DATE, -i - 7);
        Date start = c.getTime();
        DateFormat dateFormat = new SimpleDateFormat("EE, MM dd");
        dateFormat.format(start);

        return start;

    }

    private Date weeklyEndDate() {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int i = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();

        c.add(Calendar.DATE, -1);
        Date end = c.getTime();
        DateFormat dateFormat1 = new SimpleDateFormat("EE, MM dd");
        dateFormat1.format(end);
        return end;

    }



    private String getWeeklyDateString() {

        DateFormat dateFormat = new SimpleDateFormat("EE MMM dd");
        String start_date=dateFormat.format(weeklyStartDate());
        String end_date=dateFormat.format(weeklyEndDate());
        return start_date+" - "+end_date;

    }

    private String  getcuttentMonthString()
    {
        Format formatter = new SimpleDateFormat("MMMM yyyy");
        String currentMonth = formatter.format(new Date());
        return currentMonth;



>>>>>>> Sachin_Fragment
    }

    private String getcuttentYearString()
    {
        Format formatter = new SimpleDateFormat("yyyy");
        String currentYear = formatter.format(new Date());
        return currentYear;



    }


}
