package com.example.inclassassignment08_seank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Question> question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionAdapter (question,this));
    }

    private void initialData(){
        question = new ArrayList<>();
        question.add(new Question(R.string.australia,R.string.question_australia, R.drawable.australia, true));
        question.add(new Question(R.string.africa,R.string.question_africa, R.drawable.africa, false));
        question.add(new Question(R.string.middle_east,R.string.question_mideast, R.drawable.mideast, false));
        question.add(new Question(R.string.oceans,R.string.question_oceans, R.drawable.oceans, true));
        question.add(new Question(R.string.americas,R.string.question_america, R.drawable.americas, true));
    }


}