import Footer from "components/Footer";
import Navbar from "components/Navbar";
import { Link } from "react-router-dom";

export default function Home() {
    return (
        <>
            <Navbar />
            <div className="container py-4">
                <div className="p-5 mb-4 bg-light rounded-3">
                    <div className="container-fuid py-5">
                        <h1 className="display-4 fw-bold">DS Sales</h1>
                        <p className="col-md-8 fs-4">Analyze your sales performance from different perspectives</p>
                        <hr />
                        <p>This small application consists in a dashboard page to show data coming from a Rest API built with Java and Spring Boot..</p>
                        <Link to="/dashboard" className="btn btn-primary btn-lg">
                            Access Dashboard
                        </Link>
                    </div>
                </div>
            </div>
            <Footer />
        </>
    );
}