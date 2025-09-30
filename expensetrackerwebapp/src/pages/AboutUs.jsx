export default function AboutUs() {
    return (
        <div className="flex flex-col items-center justify-center text-center px-6 py-16">
            <h1 className="text-4xl font-extrabold mb-6">About Us</h1>
            <p className="text-lg text-gray-600 max-w-2xl mb-4">
                Welcome to <span className="font-semibold">Expense Tracker</span> —
                your trusted partner in managing personal finances.
            </p>
            <p className="text-lg text-gray-600 max-w-2xl mb-4">
                Our mission is to simplify money management and help you take control of
                your income and expenses. Whether you're a student, working professional,
                or entrepreneur, we provide tools that make tracking finances effortless.
            </p>
            <p className="text-lg text-gray-600 max-w-2xl">
                With powerful insights, beautiful design, and secure management,
                we aim to empower you to achieve your financial goals.
            </p>
        </div>
    );
}
