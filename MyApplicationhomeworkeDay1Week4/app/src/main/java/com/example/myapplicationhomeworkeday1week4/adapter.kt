import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationhomeworkeday1week4.Cars
import com.example.myapplicationhomeworkeday1week4.MainActivity
import com.example.myapplicationhomeworkeday1week4.R
import com.squareup.picasso.Picasso

class CareAdapter (var data:MutableList<Cars>): RecyclerView.Adapter<CarsHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CarsHolder {
        var V= LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return CarsHolder(V)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CarsHolder, position: Int) {

        holder.textView4MonyOfPrice.text= data[position].price.toString()
        holder.textView5NumOfYear.text=data[position].year.toString()
        holder.textViewBrandCar.text=data[position].brand
       Picasso.get().load(data[position].photoUrl).into(holder.imageViewPhotoUrl)
        holder.itemView.setOnClickListener{

            println(data[position].brand)
            var intint= Intent(holder.itemView.context,MainActivity::class.java)
            var m=data[position]
            m.rating=9.1f
            m.storiLine="Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency"
            intint.putExtra("movie",data[position])
            holder.itemView.context.startActivity(intint)


        }
    }

}





class CarsHolder(V: View): RecyclerView.ViewHolder(V){

    var imageViewPhotoUrl=V.findViewById<ImageView>(R.id.imageViewPhotoUrl)
    var textViewBrandCar=V.findViewById<TextView>(R.id.textViewBrandCar)
    var textView4MonyOfPrice=V.findViewById<TextView>(R.id.textView4MonyOfPrice)
    var textView5NumOfYear=V.findViewById<TextView>(R.id.textView5NumOfYear)
}