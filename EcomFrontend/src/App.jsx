import React from 'react'
import AddProduct from './components/AddProduct'
import "./App.css"
import Navbar from './components/Navbar'
import Home from './components/Home'

const App = () => {
  return (
    <div>

      <Navbar/>
      <Home/>
      <AddProduct/>
    </div>
  )
}

export default App