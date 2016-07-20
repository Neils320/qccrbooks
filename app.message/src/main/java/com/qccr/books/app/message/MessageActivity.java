package com.qccr.books.app.message;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author: zhuhuanhuan
 * @time: 17:24
 * @email: zhuhuanhuan@qccr.com
 * @version: 1.0.0
 * @desc:
 */
public class MessageActivity extends AppCompatActivity {

    @BindView(R.id.message_content)
    RecyclerView messageContent;

    MessageAdapter mMessageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ButterKnife.bind(this);

        initData();
    }

    void initData() {

        List<Message> messages = new ArrayList<>();
        Message message = new Message();
        message.title = "摄影精选推送";
        message.titlePic = "http://cdn.ruguoapp.com/o_1a94vunc514kpj9s1g0s13tksl02t.jpeg?imageView2/0/w/120/h/120/interlace/1";
        message.date = "2016-07-20T01:31:15.238Z";
        message.content = "思聪投资的《吐槽大会》被下架背后：一个具有所有爆款特质节目的掌控与意外";
        message.commentCount = 11;
        message.likeCount = 100;
        message.paperUrl = "http://edu.163.com/16/0715/06/BS0DLRPR00294NE9.html";
        messages.add(message);

        Message msg = new Message();
        msg.title = "每天一点设计好灵感";
        msg.titlePic = "http://cdn.ruguoapp.com/o_1al194mb71sns7ke16q3s9o1k9i5j.jpg?imageView2/0/w/720/h/360";
        msg.date = "2016-06-12T03:20:41.097Z";
        msg.content = "好品位不是一天养成的，每天看一点好设计，灵感不期而至。";
        msg.commentCount = 22;
        msg.likeCount = 200;
        msg.paperUrl = "http://edu.163.com/16/0715/06/BS0DLRPR00294NE9.html";
        messages.add(msg);

        mMessageAdapter = new MessageAdapter(messages);
        messageContent.setLayoutManager(new LinearLayoutManager(this));
        messageContent.setAdapter(mMessageAdapter);
    }
}
