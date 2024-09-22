package com.example.lab_week_05


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    private val BooksTitle: TextView?
        get() = view?.findViewById(R.id.book_title)
    private val BooksDesc: TextView?
        get() = view?.findViewById(R.id.book_desc)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val coffeeId = arguments?.getInt(COFFEE_ID, 0) ?: 0
        setBooksData(coffeeId)
    }

    fun setBooksData(id: Int){
        when(id){
            R.id.malin -> {
                BooksTitle?.text = getString(R.string.malin_title)
                BooksDesc?.text = getString(R.string.malin_desc)
            }
            R.id.cinderella -> {
                BooksTitle?.text = getString(R.string.cinderella_title)
                BooksDesc?.text = getString(R.string.cinderella_desc)
            }
            R.id.bawang -> {
                BooksTitle?.text = getString(R.string.bawang_title)
                BooksDesc?.text = getString(R.string.bawang_desc)
            }
        }
    }

    companion object {
        private const val COFFEE_ID = "COFFEE_ID"
    }
}