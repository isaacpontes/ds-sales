import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import Navbar from "components/Navbar";

export default function App() {
  return (
    <>
      <Navbar />
      <div className="container py-3">
        <h1 className="text-primary py-3">Sales Dashboard</h1>

        <div className="row p-3">
          <div className="col-sm-6">
            <h5 className="text-secondary text-center">Conversion Rate (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-secondary text-center">All Sales</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-5">
          <h2 className="text-primary py-3">All Sales</h2>
          <DataTable />
        </div>
      </div>
      <Footer />
    </>
  );
}
