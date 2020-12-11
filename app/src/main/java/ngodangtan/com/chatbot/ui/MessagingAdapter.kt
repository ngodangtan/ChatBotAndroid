package ngodangtan.com.chatbot.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ngodangtan.com.chatbot.R
import ngodangtan.com.chatbot.data.Message
import ngodangtan.com.chatbot.utils.Constants.SEND_ID

class MessagingAdapter: RecyclerView.Adapter<MessagingAdapter.MessageViewHolder>() {

    var messagesList = mutableListOf<Message>()
    inner class MessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        init{
            itemView.setOnClickListener {
                messagesList.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.message_item,parent,false))
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val currentMessage = messagesList[position]

        when (currentMessage.id){
            SEND_ID -> {
//                holder.itemView.tv_message.apply {
//
//                }

            }

        }
    }

    override fun getItemCount(): Int {
        return messagesList.size
    }
}