package layout

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kelas.cobadicoding.MainActivity
import com.kelas.cobadicoding.R
import com.kelas.cobadicoding.Detail

class ListPondokName(
    private val listpondok: ArrayList<Pondok>,
   private val mainActivity: MainActivity
) : RecyclerView.Adapter<ListPondokName.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val itemRow = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_pondok, viewGroup, false)
        return ListViewHolder(itemRow)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, from, photo) = listpondok[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvFrom.text = from
        holder.itemView.setOnClickListener {
            val intent = Intent(mainActivity,Detail::class.java)
            intent.putExtra("nama",name)
            intent.putExtra("from",from)
            intent.putExtra("photo",photo)
            mainActivity.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listpondok.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_item_from)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }


}