import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
document.body.classList.add("light-theme");
createRoot(document.getElementById('root')).render(
      <App />
 
)
