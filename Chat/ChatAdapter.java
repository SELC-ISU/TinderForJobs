package Chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tfjv2.R;

import java.util.List;

import Matches.MatchesActivity;
import Matches.MatchesObject;
import Matches.MatchesViewHolders;

public class ChatAdapter extends RecyclerView.Adapter<MatchesViewHolders> {

    private List<MatchesObject> ChatList;
    private Context context;

    public ChatAdapter(List<MatchesObject> matchesList, ChatActivity context){
        this.ChatList = matchesList;
        this.context = context;
    }

    @NonNull
    @Override
    public MatchesViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matches, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        MatchesViewHolders rcv = new MatchesViewHolders((layoutView));

        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesViewHolders holder, int position) {
        holder.mMatchId.setText(ChatList.get(position).getUserId());
        holder.mMatchName.setText(ChatList.get(position).getName());
        if(!ChatList.get(position).getProfileImageUrl().equals("default")) {
            Glide.with(context).load(ChatList.get(position).getProfileImageUrl()).into(holder.mMatchImage);
        }
    }

    @Override
    public int getItemCount() {
        return ChatList.size();
    }
}
