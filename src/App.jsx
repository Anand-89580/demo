import { useState } from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HomePage from './homepage'
import BookingPage from './BookingPage';
import MyBookings from './MyBookings';
import BookingDetails from './BookingDetails';

function App() {
  const [count, setCount] = useState(0)

  return (
    <Router>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/booking" element={<BookingPage />} />
        <Route path="/mybooking" element={<MyBookings/>} />
       <Route path="/viewbooking/:id" element={<BookingDetails />} />
      </Routes>
    </Router>
  );
}

export default App
