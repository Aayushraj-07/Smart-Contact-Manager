/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: "selector", // options: 'media' | 'class' | 'selector'
  content: [
    "./pages/**/*.{js,ts,jsx,tsx}",
    "./components/**/*.{js,ts,jsx,tsx}",
    "./app/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        brand: "#1da1f2",
      },
    },
  },
  plugins: [],
};
