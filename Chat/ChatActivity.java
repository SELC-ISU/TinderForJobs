package Chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tfjv2.R;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

import Matches.MatchesAdapter;
import Matches.MatchesObject;

public class ChatActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mChatAdapter;
    private RecyclerView.LayoutManager mChatLayoutManager;

    private String currentUserId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat1);
        currentUserId = FirebaseAuth.getInstance().getCurrentUser().getUid();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);

        mChatLayoutManager = new LinearLayoutManager(ChatActivity.this);
        mRecyclerView.setLayoutManager(mChatLayoutManager);
        //mMatchesAdapter = new MatchesAdapter(getDataSetMatches(), MatchesActivity.this);
        mChatAdapter = new MatchesAdapter(getDataSetChat(), ChatActivity.this);
        mRecyclerView.setAdapter(mChatAdapter);
    }
    private ArrayList<MatchesObject> resultsChat = new ArrayList<MatchesObject>();
    private ArrayList<MatchesObject> getDataSetChat() {
        return resultsChat;
    }
}
