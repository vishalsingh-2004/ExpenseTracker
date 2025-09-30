export default function ContactUs() {
    return (
        <div className="flex flex-col items-center justify-center text-center px-6 py-16">
            <h1 className="text-4xl font-extrabold mb-6">Contact Us</h1>
            <p className="text-lg text-gray-600 max-w-xl mb-10">
                Have questions, feedback, or ideas? We’d love to hear from you.
                Reach out using the form below or connect with us directly.
            </p>

            <form className="w-full max-w-lg bg-white shadow-md rounded-2xl p-8 space-y-6">
                <input
                    type="text"
                    placeholder="Your Name"
                    className="w-full p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-purple-500"
                />
                <input
                    type="email"
                    placeholder="Your Email"
                    className="w-full p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-purple-500"
                />
                <textarea
                    rows="5"
                    placeholder="Your Message"
                    className="w-full p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-purple-500"
                ></textarea>
                <button
                    type="submit"
                    className="bg-purple-600 text-white py-3 px-6 rounded-lg hover:bg-purple-700 transition w-full"
                >
                    Send Message
                </button>
            </form>

            <div className="mt-10 text-gray-700 space-y-2">
                <p>📞 Phone: +91 7693024120</p>
                <p>📧 Email: mayank1718vk@gmail.com</p>
            </div>
        </div>
    );
}
