package com.birjulabsinc.bookviewactivity.tabsfragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        // using switch case to change fragment in pager activity
        switch (position){
            case 0: return new ContentsFragment();
            case 1: return new BookMarksFragment();
            case 2: return new NotesFragment();
            default: return new ContentsFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title= null;
        // also we can use switch case
        if (position==0){
            title = "Contents";
        } if (position==1){
            title = "Book Marks";
        } if (position==2){
            title = "Notes";
        }

        return title;
    }
}
