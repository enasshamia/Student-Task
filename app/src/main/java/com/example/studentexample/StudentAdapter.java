package com.example.studentexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentVH> {


    private Context context;
    private List<Student> studentList;

    public StudentAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_student, parent, false);
        return new StudentVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVH holder, int position) {
        holder.bind(studentList.get(position));
    }

    @Override
    public int getItemCount() {
        return studentList == null ? 0 : studentList.size();
    }

    class StudentVH extends RecyclerView.ViewHolder {
        private TextView tv_id, tv_name, tv_level, tv_avg;
        private CardView container;

        StudentVH(@NonNull View itemView) {
            super(itemView);
            tv_id = itemView.findViewById(R.id.tv_id);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_level = itemView.findViewById(R.id.tv_level);
            tv_avg = itemView.findViewById(R.id.tv_avg);
            container = itemView.findViewById(R.id.container);
        }

        void bind(final Student student) {
            tv_id.setText("Student ID : " + student.getId());
            tv_name.setText("Student Name " + student.getName());
            tv_level.setText("Student Level : " + student.getLevel());
            tv_level.setText("Student avg: " + student.getAvg());
            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), StudentActivity.class);
                    intent.putExtra("id", student.getId());
                    intent.putExtra("name", student.getName());
                    intent.putExtra("level", student.getLevel());
                    intent.putExtra("avg", student.getAvg());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
